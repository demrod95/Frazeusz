package pl.edu.agh.ki.frazeusz.model.parser;

import pl.edu.agh.ki.frazeusz.model.pm.PatternMatcher;

import java.util.List;

/**
 * Created by matwoosh on 14/01/2017.
 */
public class Parser implements IParser{

    private final List<PatternMatcher> patternMatchers;

    public Parser(List<PatternMatcher> patternMatchers) {
        this.patternMatchers = patternMatchers;
    }

    public List<String> parseContent(String httpHeader, String content, String baseAbsoluteUrl) throws Exception {
        //TODO implement method
        return null;
    }

}
