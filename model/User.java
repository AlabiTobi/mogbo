package africa.semicolon.mogbo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("User")
@RequiredArgsConstructor
public class User {
    @Id
    private String id;
    @NonNull
    private String email;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String phoneNumber;
    @NonNull
    private String password;





}
