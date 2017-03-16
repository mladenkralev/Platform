package com.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.framework.BundleActivator;

@Component(service = IHello.class, name = "MySuperService", immediate = true)
public class HelloImpl implements BundleActivator, Fubar
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