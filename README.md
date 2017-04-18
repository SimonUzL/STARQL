# Streaming and Temporal ontology Access with a Reasoning-based Query Language: STARQL
Stream processing is a general information processing paradigm with different applications
in AI. Most stream languages rely on the concept of a sliding window with a bag semantics,
which is in order for relational streams but may lead to inconsistencies when applied on streams
of assertions evaluated against a conceptual model. Our approach uses a different semantics
based on ABox sequencing. The query language provides an expressive first order temporal
logic for inter-ABox reasoning. Safety conditions tame the expressiveness so that a meaning
preserving transformation of the query to backend queries on the sources as foreseen in the
OBDA paradigm is guaranteed [[1]](https://www.ifis.uni-luebeck.de/uploads/tx_wapublications/oeMoeNeu14STARQLTR.pdf).

````
PREFIX : <http://www.sport.com/Fitness/Pattern#>
CREATE PULSE pulseA WITH 
START = "2012-07-04T06:21:58CEST"^^XSD:DATETIME,
END =  "2012-07-23T00:54:35CEST"^^XSD:DATETIME,
FREQUENCY = "PT1M"^^XSD:DURATION
				 
CREATE STREAM S_out AS
				 
CONSTRUCT GRAPH NOW { ?profile a :IncreasingHeight }
FROM STREAM measurements [ NOW - "PT100M"^^XSD:DURATION, NOW ] -> "PT5M"^^XSD:DURATION
USING PULSE pulseA
SEQUENCE BY StdSeq AS SEQ1
HAVING FORALL i, j IN SEQ1 ?x,?y(
IF ((
	GRAPH i { ?profile :hasHeight ?x } 
	AND GRAPH j { ?profile :hasHeight ?y }
) AND i < j) THEN ?x <= ?y)
````

[![Build Status](https://travis-ci.org/SimonUzL/STARQL.svg?branch=master)](https://travis-ci.org/SimonUzL/STARQL)
