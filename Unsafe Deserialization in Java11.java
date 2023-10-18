//no-cwe
@Controller
public class MyController {
    @RequestMapping(value = "/", method = GET)
    public String index(@CookieValue(value = "myCookie") String myCookieString) {
        // decode the Base64 cookie value
        byte[] myCookieBytes = Base64.getDecoder().decode(myCookieString);

        // use those bytes to deserialize an object
        ByteArrayInputStream buffer = new ByteArrayInputStream(myCookieBytes);
        try (ObjectInputStream stream = new ObjectInputStream(buffer)) {
            MyObject myObject = stream.readObject();

            // ...
        }
    }
}