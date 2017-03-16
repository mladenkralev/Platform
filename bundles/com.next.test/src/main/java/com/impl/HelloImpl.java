package com.impl;

import com.interfaces.IHello;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(service = IHello.class, name = "MySuperService", immediate = true)
public class HelloImpl implements IHello
{
    @Activate
    public void turnOn()
    {
        System.out.println("FubarService activated");
    }

    @Override
    public void sayHello()
    {
        System.out.println("Hello World!");
    }
}