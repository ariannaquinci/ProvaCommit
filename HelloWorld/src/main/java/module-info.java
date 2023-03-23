module hello.ciao.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens hello.ciao.helloworld to javafx.fxml;
    exports hello.ciao.helloworld;
}