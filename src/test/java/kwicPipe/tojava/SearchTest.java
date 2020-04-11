package kwicPipe.tojava;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class SearchTest {


    @Test
    public void test1() {
        String searchPath = "TIC3001-Assignment3-testcases/Test1/ListOfFiles.in";
        String ignorePath = "TIC3001-Assignment3-testcases/Default/ToIgnore.txt";
        String requiredPath = "TIC3001-Assignment3-testcases/Default/ToRequire.txt";
        String outputPath = "TIC3001-Assignment3-testcases/Default/OutputFile.txt";
        Vector<String> expected = new Vector<String>();
        expected.add("TIC3001-Assignment3-testcases/Test1/BookTitles.txt");
        expected.add("Man with One Red Shoe The");
        expected.add("Wild Things Are Where the");
        expected.add("TIC3001-Assignment3-testcases/Test1/MovieTitles.txt");
        expected.add("Man The Invisible");
        expected.add("Wild The Call of the");
        Input input;
        ToIgnore ignore;
        ToRequire require;
        Ui ui=new Ui();
        Pipeline pipeline=new Pipeline();
        Search search;
        pipeline.setSearchListPath(searchPath);
        pipeline.setIgnoreListPath(ignorePath);
        pipeline.setRequiredListPath(requiredPath);
        pipeline.setOutputPath(outputPath);
        try {
            input=new Input();
            search = new Search(pipeline);
            search.searchTerm("man");
            ignore = new ToIgnore(pipeline);
            require = new ToRequire(pipeline);
            search.runSearch(input,ui,pipeline,ignore,require);
            search.searchTerm("WILD");
            search.runSearch(input,ui,pipeline,ignore,require);
            assertEquals(pipeline.getSearchResult(), expected);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException a){
            System.out.println(a);
        }
    }

    @Test
    public void test2() {
        String searchPath = "TIC3001-Assignment3-testcases/Test3/ListOfFiles.in";
        String ignorePath = "TIC3001-Assignment3-testcases/Default/ToIgnore.txt";
        String requiredPath = "TIC3001-Assignment3-testcases/Default/ToRequire.txt";
        String outputPath = "TIC3001-Assignment3-testcases/Default/OutputFile.txt";
        Vector<String> expected = new Vector<String>();
        Input input;
        ToIgnore ignore;
        ToRequire require;
        Ui ui=new Ui();
        Pipeline pipeline=new Pipeline();
        Search search;
        pipeline.setSearchListPath(searchPath);
        pipeline.setIgnoreListPath(ignorePath);
        pipeline.setRequiredListPath(requiredPath);
        pipeline.setOutputPath(outputPath);
        try {
            input=new Input();
            search = new Search(pipeline);
            search.searchTerm("man");
            ignore = new ToIgnore(pipeline);
            require = new ToRequire(pipeline);
            search.runSearch(input,ui,pipeline,ignore,require);
            assertEquals(pipeline.getSearchResult(), expected);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException a){
            System.out.println(a);
        }
    }
    @Test
    public void test3() {
        String searchPath = "TIC3001-Assignment3-testcases/Test2/ListOfFiles.in";
        String ignorePath = "TIC3001-Assignment3-testcases/Default/ToIgnore.txt";
        String requiredPath = "TIC3001-Assignment3-testcases/Default/ToRequire.txt";
        String outputPath = "TIC3001-Assignment3-testcases/Default/OutputFile.txt";
        Vector<String> expected = new Vector<String>();
        expected.add("TIC3001-Assignment3-testcases/Test2/BookTitles.txt");
        expected.add("Man with One Red Shoe The");
        expected.add("TIC3001-Assignment3-testcases/Test2/MovieTitles.txt");
        expected.add("Man The Invisible");
        Input input;
        ToIgnore ignore;
        ToRequire require;
        Ui ui=new Ui();
        Pipeline pipeline=new Pipeline();
        Search search;
        pipeline.setSearchListPath(searchPath);
        pipeline.setIgnoreListPath(ignorePath);
        pipeline.setRequiredListPath(requiredPath);
        pipeline.setOutputPath(outputPath);
        try {
            input=new Input();
            search = new Search(pipeline);
            search.searchTerm("man");
            ignore = new ToIgnore(pipeline);
            require = new ToRequire(pipeline);
            search.runSearch(input,ui,pipeline,ignore,require);
            search.searchTerm("hello");
            search.runSearch(input,ui,pipeline,ignore,require);
            search.searchTerm("wild things");
            search.runSearch(input,ui,pipeline,ignore,require);
            assertEquals(pipeline.getSearchResult(), expected);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException a){
            System.out.println(a);
        }
    }

    @Test
    public void test4() {
        String searchPath = "TIC3001-Assignment3-testcases/Test4/ListOfFiles.in";
        String ignorePath = "TIC3001-Assignment3-testcases/Default/ToIgnore.txt";
        String requiredPath = "TIC3001-Assignment3-testcases/Default/ToRequire.txt";
        String outputPath = "TIC3001-Assignment3-testcases/Default/OutputFile.txt";
        Vector<String> expected = new Vector<String>();
        Input input;
        ToIgnore ignore;
        ToRequire require;
        Ui ui=new Ui();
        Pipeline pipeline=new Pipeline();
        Search search;
        pipeline.setSearchListPath(searchPath);
        pipeline.setIgnoreListPath(ignorePath);
        pipeline.setRequiredListPath(requiredPath);
        pipeline.setOutputPath(outputPath);
        try {
            input=new Input();
            search = new Search(pipeline);
            search.searchTerm("man");
            ignore = new ToIgnore(pipeline);
            require = new ToRequire(pipeline);
            search.runSearch(input,ui,pipeline,ignore,require);
            assertEquals(pipeline.getSearchResult(), expected);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException a){
            System.out.println(a);
        }
    }
    @Test
    public void test5() {
        String searchPath = "TIC3001-Assignment3-testcases/Test5/ListOfFiles.in";
        String ignorePath = "TIC3001-Assignment3-testcases/Default/ToIgnore.txt";
        String requiredPath = "TIC3001-Assignment3-testcases/Default/ToRequire.txt";
        String outputPath = "TIC3001-Assignment3-testcases/Default/OutputFile.txt";
        Vector<String> expected = new Vector<String>();
        expected.add("TIC3001-Assignment3-testcases/Test5/BookTitles.txt");
        expected.add("test test");
        expected.add("test test");
        expected.add("test test");
        expected.add("test test");
        expected.add("TIC3001-Assignment3-testcases/Test5/MovieTitles.txt");
        expected.add("Test test");
        expected.add("test test");
        expected.add("test Test");
        expected.add("test test");
        Input input;
        ToIgnore ignore;
        ToRequire require;
        Ui ui=new Ui();
        Pipeline pipeline=new Pipeline();
        Search search;
        pipeline.setSearchListPath(searchPath);
        pipeline.setIgnoreListPath(ignorePath);
        pipeline.setRequiredListPath(requiredPath);
        pipeline.setOutputPath(outputPath);
        try {
            input=new Input();
            search = new Search(pipeline);
            search.searchTerm("test");
            ignore = new ToIgnore(pipeline);
            require = new ToRequire(pipeline);
            search.runSearch(input,ui,pipeline,ignore,require);
            assertEquals(pipeline.getSearchResult(), expected);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException a){
            System.out.println(a);
        }
    }
    @Test
    public void test6() {
        String searchPath = "TIC3001-Assignment3-testcases/Test6/ListOfFiles.in";
        String ignorePath = "TIC3001-Assignment3-testcases/Default/ToIgnore.txt";
        String requiredPath = "TIC3001-Assignment3-testcases/Default/ToRequire.txt";
        String outputPath = "TIC3001-Assignment3-testcases/Default/OutputFile.txt";
        Vector<String> expected = new Vector<String>();
        Input input;
        ToIgnore ignore;
        ToRequire require;
        Ui ui=new Ui();
        Pipeline pipeline=new Pipeline();
        Search search;
        pipeline.setSearchListPath(searchPath);
        pipeline.setIgnoreListPath(ignorePath);
        pipeline.setRequiredListPath(requiredPath);
        pipeline.setOutputPath(outputPath);
        try {
            input=new Input();
            search = new Search(pipeline);
            search.searchTerm("test");
            ignore = new ToIgnore(pipeline);
            require = new ToRequire(pipeline);
            search.runSearch(input,ui,pipeline,ignore,require);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException a){
            System.out.println(a);
        }
    }


}

