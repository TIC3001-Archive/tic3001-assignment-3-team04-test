package kwicPipe.tojava;

import java.io.*;
import java.nio.channels.Pipe;
import java.util.Scanner;
import java.util.Vector;

public class Search {
    private String search;
    private Vector<String> searchList=new Vector<String>();
    public Search(Pipeline pipeline) throws FileNotFoundException {
        File f = new File(pipeline.getSearchListPath());
        Scanner s = new Scanner(f);
        String thisLine;
        while(s.hasNext()) {
            thisLine=s.nextLine();
            if(!thisLine.isEmpty()){
                searchList.add(thisLine.trim());
            }
        }
    }
    public void searchTerm(String in){ search=in; }
    public void runSearch(Input in, Ui ui,Pipeline pipeline,ToIgnore ignore, ToRequire require) throws IOException{
        pipeline.resetSearchResult();
        ui.setIgnorePath(pipeline,"");
        ui.setRequiredPath(pipeline,"");
        FileWriter fw = new FileWriter(pipeline.getRequiredListPath());
        fw.write("");
        fw.close();
        pipeline.setOutputPath("TIC3001-Assignment3-testcases/Default/OutputFile.txt");
        addSearchToFile(pipeline);
        //in.runCircular(ui,pipeline,ignore,require);
        ui.showToUser("\n\n### Search result(s) for "+search+":");
        for(int i=0;i<searchList.size();i++){
            try {
                searchAFile(in, ui, pipeline, ignore, require, searchList.get(i));
            } catch (FileNotFoundException e) {
                ui.printError("File(s) try to search from does not exist");
            }
        }
        printSearchResult(ui, pipeline);
    }
    public void searchAFile(Input in, Ui ui, Pipeline pipeline, ToIgnore ignore, ToRequire require, String inputPath) throws FileNotFoundException{
        ui.setInputPath(pipeline, inputPath);
        pipeline.resetLines();
        in=new Input(pipeline);
        ignore=new ToIgnore(pipeline);
        require=new ToRequire(pipeline);
        in.runCircular(ui,pipeline,ignore,require);
        Vector<String> result=pipeline.getLines();
        if(!pipeline.getLines().isEmpty()){
            pipeline.addSearchResult(inputPath);
            for(int i = 0;i<result.size();i++){
                pipeline.addSearchResult(result.get(i));
            }
        }
    }
    private void addSearchToFile(Pipeline pipeline) throws IOException{
        try {
            Writer output;
            output = new BufferedWriter(new FileWriter(pipeline.getRequiredListPath()));
            output.append(search+"\n");
            output.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void printSearchResult(Ui ui, Pipeline pipeline){
        Vector<String> result=pipeline.getSearchResult();
        for(int i=0;i<result.size();i++){
            ui.showToUser(result.get(i));
        }
    }
}
