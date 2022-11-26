Getting Started
======

Please find a Java application built by Gradle focusing on averaging ages of given people.

# Technologies Involved
- Java 8
- Gradle


# Building
``` $ gradle build ```

# Running
``` $ gradle run ```

# Parameters
- Two parameters white spaced Names and Ages through following file;

``` ./app/build.gradle ```

``` 
...

run {
    args = ["John Kate", "34 33"]
} 

...
```

# Output

``` 
Kate is 33 years old
John is 34 years old
```