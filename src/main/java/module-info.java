module com.uiejemplos.proyectopruebagithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.proyectopruebagithub to javafx.fxml;
    exports com.uiejemplos.proyectopruebagithub;
}