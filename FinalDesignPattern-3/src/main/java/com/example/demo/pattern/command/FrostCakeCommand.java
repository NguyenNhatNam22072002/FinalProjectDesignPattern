package com.example.demo.pattern.command;

public class FrostCakeCommand implements CakeCommand {
    private CakeCMD cake;

    public FrostCakeCommand(CakeCMD cake) {
        this.cake = cake;
    }

    @Override
    public String execute() {
        return cake.frost();
    }
}
