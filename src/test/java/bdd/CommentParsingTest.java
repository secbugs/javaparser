package bdd;

import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.StoryFinder;
import org.junit.Test;

import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

public class CommentParsingTest {

    @Test
    public void run() throws Throwable {
        // Embedder defines the configuration and candidate steps
        Embedder embedder = new CommentParsingEmbedder();
        List<String> storyPaths = new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/bdd/*.story", "");
        embedder.runStoriesAsPaths(storyPaths);
    }

}

