package com.example.demo.pattern.command;

public class DecorateCakeCommand implements CakeCommand {
    private CakeCMD cake;

    public DecorateCakeCommand(CakeCMD cake) {
        this.cake = cake;
    }

    @Override
    public String execute() {
        return cake.decorate();
    }
}
