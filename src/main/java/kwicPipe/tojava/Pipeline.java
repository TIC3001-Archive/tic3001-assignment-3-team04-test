package kwicPipe.tojava;

import java.util.Vector;

public class Pipeline {
    private String inputPath;
    private String ignoreListPath;
    private String requiredListPath;
    private String outputPath;
    private String searchListPath;
    Vector<String> lines;
    Vector<String> toIgnore;
    Vector<String> toRequire;
    Vector<String> searchResult;
    public Pipeline() {
        lines=new Vector<String>();
        toIgnore=new Vector<String>();
        toRequire=new Vector<String>();
    }
    public void setOutputPath(String output) {
        outputPath=output;
    }
    public void setInputPath(String input){
        inputPath=input;
    }
    public void setIgnoreListPath(String ignore) { ignoreListPath=ignore; }
    public void setRequiredListPath(String require) { requiredListPath=require; }
    public void setSearchListPath(String toSearch) { searchListPath=toSearch; }
    public String getInputPath(){
        return inputPath;
    }
    public String getOutputPath(){
        return outputPath;
    }
    public String getIgnoreListPath(){ return ignoreListPath; }
    public String getRequiredListPath() {return requiredListPath; }
    public String getSearchListPath() { return searchListPath; }
    public void setLines(Vector<String> input){
        lines=input;
    }
    public Vector<String> getLines(){
        return lines;
    }
    public Vector<String> getToIgnore(){return toIgnore;}
    public Vector<String> getToRequire(){return toRequire;}
    public Vector<String> getSearchResult(){return searchResult;}
    public void addLine(String in){lines.add(in);}
    public void addLine(int i, String in){lines.add(i,in);}
    public void addIgnoreLine(String in){toIgnore.add(in);}
    public void addRequiredLine(String in){toRequire.add(in);}
    public void addSearchResult(String in) { searchResult.add(in); }
    public void resetLines(){
        lines=new Vector<String>();
    }
    public void resetIgnoreList(){toIgnore=new Vector<String>();}
    public void resetRequiredList(){toRequire=new Vector<String>();}
    public void resetSearchResult() { searchResult=new Vector<String>(); }
}
