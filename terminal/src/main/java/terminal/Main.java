package terminal;

import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Configuration;

public class Main extends Application {
    @Override
    protected void configure(Configuration config) {
        config.setTitle("Comet Terminal");
    }

    @Override
    public void process() {
    	Login.show();
        ImGui.showDemoWindow();
    }

    public static void main(String[] args) {
        launch(new Main());
    }
}