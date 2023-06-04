package com.example.demo.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class CakeMakerCommand {
	private List<CakeCommand> commands = new ArrayList<>();

    public void addCommand(CakeCommand command) {
        commands.add(command);
    }

    public List<String> executeCommands() {
        List<String> results = new ArrayList<>();
        for (CakeCommand command : commands) {
            results.add(command.execute());
        }
        commands.clear();
        return results;
    }
}
