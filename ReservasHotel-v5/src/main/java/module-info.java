module com.example.reservashotelv5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesalandalus.programacion.reservashotel to javafx.fxml;
    exports org.iesalandalus.programacion.reservashotel;
}