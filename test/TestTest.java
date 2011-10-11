import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeManager;
import org.junit.Test;

/**
 * @author Konstantin Ulitin
 */
public class TestTest{
  @Test
  public void testTest() {
    FileType ad = FileTypeManager.getInstance().getFileTypeByFileName("test.ini");
    FileType iniType = FileTypeManager.getInstance().getFileTypeByExtension("ini");
    System.out.println("TEST!!1");
  }
}

