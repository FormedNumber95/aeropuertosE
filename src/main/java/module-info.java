module es.aketzagonzalez {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens es.aketzagonzalez.aeropuertosE to javafx.fxml;
    exports es.aketzagonzalez.aeropuertosE;
    exports model;
}