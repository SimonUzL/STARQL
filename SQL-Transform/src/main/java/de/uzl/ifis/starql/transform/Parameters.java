/**
 * Parameter
 *
 * @author Christian Neuenstadt
 */

package de.uzl.ifis.starql.transform;

import it.unibz.krdb.obda.model.OBDAModel;

import java.util.HashSet;
import java.util.Set;

import org.semanticweb.owlapi.model.OWLOntology;

public class Parameters {
	Set<Stream> streams = new HashSet<Stream>();
	String streamPath = "/opt/data/ADP-Server/Siemensdata/";
	String streamSourceCfg = null;
	Boolean useFile = true; 
	public Boolean getUseFile() {
		return useFile;
	}

	public void setUseFile(Boolean useFile) {
		this.useFile = useFile;
	}

	private OWLOntology ontology = null;
	public OWLOntology getOntology() {
		return ontology;
	}

	public void setOntology(OWLOntology ontology) {
		this.ontology = ontology;
		
	}

	public OBDAModel getObdaModel() {
		return obdaModel;
	}

	public void setObdaModel(OBDAModel obdaModel) {
		this.obdaModel = obdaModel;
	}

	private OBDAModel obdaModel = null;
	public String getStreamPath() {
		return streamPath;
	}

	public void setStreamPath(String streamPath) {
		this.streamPath = streamPath;
	}
	
	public String getStreamSourceCfg() {
		return streamSourceCfg;
	}
	
	public void setStreamSourceCfg(String streamSourceCfg) {
		this.streamSourceCfg = streamSourceCfg;
	}

	public class Stream{
		private int ratio = 1;
		private Boolean outputSame = false;
		private String startTimestamp = "now";
		private String name = "";
		
		
		public Stream(){
			
		}
		
		public Stream(String name, int ratio, Boolean same, String start){
			setName(name);
			setRatio(ratio);
			setOutputSame(same);
			setStartTimestamp(start);
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRatio() {
			return ratio;
		}
		public void setRatio(int ratio) {
			this.ratio = ratio;
		}
		public Boolean getOutputSame() {
			return outputSame;
		}
		public void setOutputSame(Boolean outputSame) {
			this.outputSame = outputSame;
		}
		public String getStartTimestamp() {
			return startTimestamp;
		}
		public void setStartTimestamp(String startTimestamp) {
			this.startTimestamp = startTimestamp;
		}
	}
	
	public Parameters(){
		
	}
	
	public void addStream(String name, int ratio, Boolean same, String start){
		streams.add(new Stream(name, ratio, same, start));
	}
	
	public Stream getStream(String name){
		Stream stream = null;
		for(Stream strm : streams)
			if(strm.getName().equals(name))
				return strm;
		return stream;
	}
}
