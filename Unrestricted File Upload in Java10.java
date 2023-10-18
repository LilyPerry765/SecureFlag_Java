//no-cwe
public class UploadAction extends ActionSupport {
    private File uploadedFile;
    // setter and getter for uploadedFile

    public String execute() {
        try {
            File fileToCreate = new File(filepath + File.separator +filename);
            // Copy temporary file content to this file
            FileUtils.copyFile(uploadedFile, fileToCreate);
            return "SUCCESS";
        } catch (Throwable e) {
            addActionError(e.getMessage());
            return "ERROR";
        }
    }
}