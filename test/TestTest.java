import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeManager;
import ini4idea.utils.IniLoader;
import org.junit.Test;

/**
 * @author Konstantin Ulitin
 */
public class TestTest{
  @Test
  public void testTest() {
    IniLoader iniLoader = new IniLoader();
    iniLoader.initComponent();
    //FileType iniType =
    //FileTypeManager.getInstance().associateExtension(,"ini");
    FileType ad = FileTypeManager.getInstance().getFileTypeByFileName("test.ini");
    FileType iniType = FileTypeManager.getInstance().getFileTypeByExtension("ini");
    System.out.println("TEST!!1");
  }
}

