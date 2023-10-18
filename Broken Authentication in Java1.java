//cwe287
@RestController
@RequestMapping(path = "/admin")
public class AdminApi {
    @PostMapping(path = "action")
    public ResponseEntity doAction() {
        // ...
    }
}