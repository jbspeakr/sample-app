import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SampleApplication {

    public static void main(String[] args) throws IOException, URISyntaxException {
        System.out.println("Running Sample Application");

        Files.lines(Paths.get(ClassLoader.getSystemResource("data.csv").toURI()))
                .forEach(line -> System.out.println(line));



    }


}


