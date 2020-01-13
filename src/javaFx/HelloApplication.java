package javaFx;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;

public class HelloApplication extends Application{
	@Override
    public void start(Stage primaryStage) throws Exception {
        /**
         * �������Ǵ���һ��Button�������ǵ��Button��ʱ�򣬸ı�Button�����ݡ�
         */

        Button btnHello = new Button("Hello");
        /**
         * ����btnHello��ť����¼�
         * ����ʹ����Java8��Lambda���ʽ��setOnAction�Ĳ���ΪEventHandler<ActionEvent> value
         * EventHandlerΪһ���ӿڣ��������������ַ�ʽʵ��EventHandler�ӿڣ�
         * 1. ����һ���ڲ���
         * 2. ����һ��������
         * 3. ʹ��Lambda���ʽ�������ں����岻��������
         */
        btnHello.setOnAction(event->{
            btnHello.setText("Hello World, I am JavaFX!");
        });

        /**
         *  BorderPane��һ�����ڲ��ֵ�Pane��BoerderPane�����ָ�Ϊ�����������岿�֡�
         *  ���ǿ��Խ�UI�ؼ�������BorderPane���������Һ��м䡣
         *  ���ｫ��Button�������м䡣
         */
        BorderPane pane = new BorderPane();
        pane.setCenter(btnHello);

        // ��pane���뵽Scen��
        Scene scene = new Scene(pane, 500, 500);

        // ����stage��scen��Ȼ����ʾ���ǵ�stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();

    }

    public static void main(String[] args) {
        // JavaFX��main����������Ҫ����launch����
        launch(args);
    }


}
