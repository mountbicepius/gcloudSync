package com.anirudh.gcloudsync;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import com.dlsc.formsfx.model.structure.Field;
import com.dlsc.formsfx.model.structure.Form;
import com.dlsc.formsfx.model.structure.Group;
import com.dlsc.formsfx.model.structure.Section;
import com.dlsc.formsfx.model.util.ResourceBundleService;
import com.dlsc.formsfx.model.validators.DoubleRangeValidator;
import com.dlsc.formsfx.model.validators.IntegerRangeValidator;
import com.dlsc.formsfx.model.validators.RegexValidator;
import com.dlsc.formsfx.model.validators.StringLengthValidator;
import com.dlsc.formsfx.view.controls.SimpleCheckBoxControl;
import com.dlsc.formsfx.view.controls.SimpleRadioButtonControl;
import com.dlsc.formsfx.view.util.ColSpan;
import java.util.Locale;
import java.util.ResourceBundle;
/*import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;*/


public class App extends Application
{
   @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
		Form loginForm = Form.of(
		        Group.of(
		                Field.ofStringType(model.usernameProperty())
		                        .label("Username"),
		                Field.ofStringType(model.passwordProperty())
		                        .label("Password")
		                        .required("This field can’t be empty")
		        )
		).title("Login");
    }

    public static void main(String[] args) {
		launch();
	}
			/*// Instantiates a client
		    Storage storage = StorageOptions.getDefaultInstance().getService();

		    // The name for the new bucket
		    String bucketName = "my-new-bucket";

		    // Creates the new bucket
		    Bucket bucket = storage.create(BucketInfo.of(bucketName));*/
}
