module com.example.easyvideocompressor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.easyvideocompressor to javafx.fxml;
    exports com.example.easyvideocompressor;
}