package ar.edu.unlp.info.oo2.ejercicio15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class FileOO2Test {
    @Test
    public void testFilePrettyPrint() {
        FileOO2 file = new File("example", "txt", 100, LocalDate.now(), LocalDate.now(), "rw-r--r--");
        assertEquals("File: example.txt (size: 100)", file.prettyPrint());
    }

    @Test
    public void testNameDecorator() {
        FileOO2 file = new File("example", "txt", 100, LocalDate.now(), LocalDate.now(), "rw-r--r--");
        file = new Name(file);
        assertEquals("File: example.txt (size: 100), Name: example", file.prettyPrint());
    }

    @Test
    public void testExtentionDecorator() {
        FileOO2 file = new File("example", "txt", 100, LocalDate.now(), LocalDate.now(), "rw-r--r--");
        file = new Extention(file);
        assertEquals("File: example.txt (size: 100), Extention: txt", file.prettyPrint());
    }

    @Test
    public void testSizeDecorator() {
        FileOO2 file = new File("example", "txt", 100, LocalDate.now(), LocalDate.now(), "rw-r--r--");
        file = new Size(file);
        assertEquals("File: example.txt (size: 100) \n Size: 100", file.prettyPrint());
    }

    @Test
    public void testCreationDateDecorator() {
        LocalDate creationDate = LocalDate.now();
        FileOO2 file = new File("example", "txt", 100, creationDate, LocalDate.now(), "rw-r--r--");
        file = new CreationDate(file);
        assertEquals("File: example.txt (size: 100), Creation Date: " + creationDate.toString(), file.prettyPrint());
    }

    @Test
    public void testModificationDateDecorator() {
        LocalDate modificationDate = LocalDate.now();
        FileOO2 file = new File("example", "txt", 100, LocalDate.now(), modificationDate, "rw-r--r--");
        file = new ModificationDate(file);
        assertEquals("File: example.txt (size: 100), Modification Date: " + modificationDate.toString(), file.prettyPrint());
    }

    @Test
    public void testPermissionsDecorator() {
        FileOO2 file = new File("example", "txt", 100, LocalDate.now(), LocalDate.now(), "rw-r--r--");
        file = new Permissions(file);
        assertEquals("File: example.txt (size: 100), Permissions: rw-r--r--", file.prettyPrint());
    }

    @Test
    public void testMultipleDecorators() {
        FileOO2 file = new File("example", "txt", 100, LocalDate.now(), LocalDate.now(), "rw-r--r--");
        file = new Name(file);
        file = new Extention(file);
        file = new Size(file);
        assertEquals("File: example.txt (size: 100), Name: example, Extention: txt, Size: 100", file.prettyPrint());
    }
}
