package com.example.demo.pattern.command;

public class BakeCakeCommand implements CakeCommand {
    private CakeCMD cake;

    public BakeCakeCommand(CakeCMD cake) {
        this.cake = cake;
    }

    @Override
    public String execute() {
        return cake.bake();
    }
}
