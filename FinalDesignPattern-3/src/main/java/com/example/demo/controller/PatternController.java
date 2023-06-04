package com.example.demo.controller;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pattern.adapter.Microwave;
import com.example.demo.pattern.adapter.MicrowaveAdapter;
import com.example.demo.pattern.adapter.MicrowaveImpl;
import com.example.demo.pattern.adapter.Oven;
import com.example.demo.pattern.chainOfResponsibility.CakeCOR;
import com.example.demo.pattern.chainOfResponsibility.CakeMakerCOR;
import com.example.demo.pattern.command.BakeCakeCommand;
import com.example.demo.pattern.command.CakeCMD;
import com.example.demo.pattern.command.CakeCommand;
import com.example.demo.pattern.command.CakeMakerCommand;
import com.example.demo.pattern.command.DecorateCakeCommand;
import com.example.demo.pattern.command.FrostCakeCommand;
import com.example.demo.pattern.decorator.BasicCake;
import com.example.demo.pattern.decorator.CherryDecorator;
import com.example.demo.pattern.decorator.CreamDecorator;
import com.example.demo.pattern.decorator.ICakeDecorator;
import com.example.demo.pattern.dependencyInjection.CakeConfig;
import com.example.demo.pattern.dependencyInjection.CakeMakerDI;
import com.example.demo.pattern.dependencyInjection.OvenDI;
import com.example.demo.pattern.facade.CakeFacade;
import com.example.demo.pattern.factory.CakeFactory;
import com.example.demo.pattern.factory.ICake;
import com.example.demo.pattern.observer.CakeBaker;
import com.example.demo.pattern.observer.CakeObserver;
import com.example.demo.pattern.observer.Observer;
import com.example.demo.pattern.proxy.CakeMakerProxy;
import com.example.demo.pattern.proxy.ICakeMaker;
import com.example.demo.pattern.singleton.Cake;
import com.example.demo.pattern.singleton.CakeMakerSin;
import com.example.demo.pattern.strategy.CakeStra;
import com.example.demo.pattern.strategy.MicrowaveBakingStrategy;
import com.example.demo.pattern.strategy.TraditionalBakingStrategy;
import com.example.demo.pattern.template.CakeMakerTemplate;
import com.example.demo.pattern.template.ChocolateCakeMaker;
import com.example.demo.pattern.template.VanillaCakeMaker;

@RestController
public class PatternController {

    @GetMapping("/singleton-pattern")
    public String singletonPatternDemo() {
        // Implement the Singleton Pattern demonstration logic here
    	// Create a cake maker instance
        CakeMakerSin cakeMaker = CakeMakerSin.getInstance();
        // Make a cake
        Cake cake = cakeMaker.makeCake("Chocolate", "Round");      
        // Print the cake details
        return cake.toString();
    }

    @GetMapping("/factory-pattern")
    public String factoryPatternDemo() {
        // Implement the Factory Pattern demonstration logic here
    	// Create a cake using the factory
        CakeFactory cakeFactory = new CakeFactory();
        ICake chocolateCake = cakeFactory.createCake("chocolate");   
        ICake vanillaCake = cakeFactory.createCake("vanilla"); 
           
        return chocolateCake.bake() + "<br>" + vanillaCake.bake();  
    }

    @GetMapping("/dependency-injection-pattern")
    public String dependencyInjectionPatternDemo() {
        // Implement the Dependency Injection Pattern demonstration logic here
    	CakeMakerDI cakeMaker = new CakeMakerDI(new OvenDI());
    	String cakeMakingProcessOutput = cakeMaker.makeCake();
        return cakeMakingProcessOutput;
    }

    @GetMapping("/template-method-pattern")
    public String templateMethodPatternDemo() {
        // Implement the Template Method Pattern demonstration logic here
    	// Example usage of the Template Method pattern
        CakeMakerTemplate vanillaCakeMaker = new VanillaCakeMaker();
        String vanillaCakeResult = vanillaCakeMaker.makeCake();

        CakeMakerTemplate chocolateCakeMaker = new ChocolateCakeMaker();
        String chocolateCakeResult = chocolateCakeMaker.makeCake();
        
        return vanillaCakeResult + "================================================================" 
        		+ "<br>" + chocolateCakeResult;
    }

    @GetMapping("/observer-pattern")
    public String observerPatternDemo() {
        // Implement the Observer Pattern demonstration logic here
    	CakeBaker cakeBaker = new CakeBaker();

        Observer observer1 = new CakeObserver("Observer 1");
        Observer observer2 = new CakeObserver("Observer 2");

        String registrationResult1 = cakeBaker.registerObserver(observer1);
        String registrationResult2 = cakeBaker.registerObserver(observer2);

        String bakeResult1 = cakeBaker.bakeCake("Chocolate");

        String removalResult = cakeBaker.removeObserver(observer2);

        String bakeResult2 = cakeBaker.bakeCake("Vanilla");

        String notification = cakeBaker.notifyObservers("Strawberry");
        
        return registrationResult1 + "<br>" + registrationResult2 + "<br>" + bakeResult1 
        		+ "<br>" + removalResult + "<br>" + bakeResult2 + "<br>" + notification;
    }

    @GetMapping("/decorator-pattern")
    public String decoratorPatternDemo() {
        // Implement the Decorator Pattern demonstration logic here
    	// Create a basic cake
    	ICakeDecorator cake = new BasicCake();        
        String result1 = cake.decorate();
        
        // Decorate the cake with cream
        cake = new CreamDecorator(cake);
        String result2 = cake.decorate();


        // Decorate the cake with cherries
        cake = new CherryDecorator(cake);
        String result3 = cake.decorate();

        return result1 + "<br>" + result2 + "<br>" + result3;
    }

    @GetMapping("/proxy-pattern")
    public String proxyPatternDemo() {
        // Implement the Proxy Pattern demonstration logic here
    	 ICakeMaker cakeMaker = new CakeMakerProxy();
         String result = cakeMaker.makeCake();
        return result;
    }

    @GetMapping("/strategy-pattern")
    public String strategyPatternDemo() {
        // Implement the Strategy Pattern demonstration logic here
    	// Create a cake and choose the baking strategy
        CakeStra cake1 = new CakeStra(new TraditionalBakingStrategy());
        CakeStra cake2 = new CakeStra(new MicrowaveBakingStrategy());

        // Bake the cake
        String result1 = cake1.bake();        
        String result2 = cake2.bake();
        
        return result1 + "<br>" + result2;
    }

    @GetMapping("/chain-of-responsibility-pattern")
    public String chainOfResponsibilityPatternDemo() {
        // Implement the Chain of Responsibility Pattern demonstration logic here
    	CakeMakerCOR cakeMaker = new CakeMakerCOR();

        // Make the cake
        CakeCOR cake = cakeMaker.makeCake();

        String result = "";
        // Print the steps
        List<String> steps = cake.getSteps();
        for (String step : steps) {
        	result += (step + "<br>");
        }
        return result;
    }

    @GetMapping("/command-pattern")
    public String commandPatternDemo() {
        // Implement the Command Pattern demonstration logic here
    	// Create the cake
    	CakeCMD cake = new CakeCMD();

        // Create the invoker
        CakeMakerCommand cakeMakerCommand = new CakeMakerCommand();

        // Create the commands
        CakeCommand bakeCakeCommand = new BakeCakeCommand(cake);
        CakeCommand frostCakeCommand = new FrostCakeCommand(cake);
        CakeCommand decorateCakeCommand = new DecorateCakeCommand(cake);

        // Add the commands to the invoker
        cakeMakerCommand.addCommand(bakeCakeCommand);
        cakeMakerCommand.addCommand(frostCakeCommand);
        cakeMakerCommand.addCommand(decorateCakeCommand);
        
        String Result = "";
        // Execute the commands
        List<String> results = cakeMakerCommand.executeCommands();
        for (String result : results) {
            Result += (result + "<br>"); 
        }
        return Result;
    }

    @GetMapping("/facade-pattern")
    public String facadePatternDemo() {
        // Implement the Facade Pattern demonstration logic here
    	CakeFacade cakeFacade = new CakeFacade();
        String result = cakeFacade.orderCake("Chocolate", 2);
        return result;
    }

    @GetMapping("/adapter-pattern")
    public String adapterPatternDemo() {
        // Implement the Adapter Pattern demonstration logic here
    	  Microwave microwave = new MicrowaveImpl();
          Oven microwaveOven = new MicrowaveAdapter(microwave);
        return microwaveOven.preheat(180) + "<br>" + microwaveOven.bake("Cake");
    }
}
