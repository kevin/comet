package terminal;

import imgui.ImGui;
import imgui.flag.ImGuiInputTextFlags;
import imgui.type.ImString;

public class Login {
	
    private static ImString user = new ImString();
    private static ImString password = new ImString();
	public static void show() {
    	ImGui.begin("Login");
    	ImGui.inputText("Username", user);
    	ImGui.inputText("Password", password, ImGuiInputTextFlags.Password);
        ImGui.button("Log in");
        ImGui.end();
	}

}
