package org.example.activity;

import io.temporal.activity.ActivityInterface;

@ActivityInterface
public interface HelloActivity {
    String hello(String name);
}
