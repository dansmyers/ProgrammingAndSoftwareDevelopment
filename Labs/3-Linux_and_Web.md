# Linux and Mimir

## Overview

This lab will let you practice using the Mimir environment.

Use the basic Linux features we worked through in class to complete the assignments below.

The lab has two parts:

- Installing and running some new programs on Linux

- Creating and serving a basic web page using HTML and CSS

## Fun with Programs

### Cowsay?

Let's install a new program. **Type this command in the terminal window of your Mimir IDE**.
```
sudo apt-get install cowsay
```

Linux systems have the notion of privilege levels and access control. The top level account on any system is the **superuser** or **root** account, which has the ability to make any change to anything. Regular user accounts always run with privileges below that of root.

`sudo` is `substitute user do`&mdash;it's a way to run individual commands with superuser-level privileges without actually logging in as the root account.

`apt-get` is a standard command for managing packages and installing programs on many Linux distros. It has to be run as root to make
system changes, so it's prefixed by `sudo`.

![xkcd #149](https://imgs.xkcd.com/comics/sandwich.png)

Run the program:

```
cowsay "Hello, Friend!"
```

Make the cow say a few different things.

### The Man Pages (Not a Dating Site)

To get more information on a system command, consult its manual page using the `man` command.
```
man cowsay
```    
This brings up a description of the `cowsay` command, including discussion of its optional flags and arguments.

Use the arrow keys to scroll and **press `q` to quit the viewer**.

`cowsay` can take on several optional arguments, which are called **flags**. For example, to make a dead cow, supply the `-d` flag:

```
cowsay -d "Hello, Friend!"
 _______________
< Hello, Friend >
 ---------------
        \   ^__^
         \  (xx)\_______
            (__)\       )\/\
             U  ||----w |
                ||     ||
```
    
You can also use a different image file with the `-f` flag:

```
cowsay -f dragon "Extra crispy!"
```

### Fortunate Cows

Install another silly program:
```
sudo apt-get install fortune
```
`fortune` prints sayings&mdash;some profound, some not&mdash;to the console. You can have some fun by **piping** the output of `fortune` to the input of `cowsay`.

```
fortune | cowsay
```

A **pipe** is a connection between two processes. The output of one end of the pipe becomes the input to the other end. In this example, the output of `fortune`, which would ordinarily go to the console, is redirected to the `cowsay` program instead, which then uses it as input and prints an oracular cow.

Pipes are a common tool in the Unix world: they allow you to chain small, simple programs together to accomplish complex feats of text processing.


## Let's Make a Web Server

### Write and Serve a Basic Web Page

**Creating the Page**  Let's make a basic web page. 

First, `cd` to your `CMS_121` directory and make a new directory to hold the new files you're going to write:

```
cd CMS_121
mkdir Lab_1_Web_Page
cd Lab_1_Web_Page
```

It needs to be named `index.html`.

```
touch index.html
open index.html
```

Put the following text in `index.html`. I'll tell you more about how this file is put together in the next section, after you've had the
chance to run and display it.

```
<!DOCTYPE html>
<html>
    <!-- This is an HTML comment -->
    <!-- 
        The basic HTML file has two sections:
        <head> contains metainformation on the whole page
        <body> contains page content
      -->

    <head>
        <title>This appears at the top of the browser.</title>
    </head>
    <body>
        <h1>This is a Website.</h1>
        
        <p>This is a paragraph of text on a website.</p>
        
        <p>Here's another paragraph.</p>
        
        <p>That's all.</p>
    </body>
</html>
```

Save the file using CTRL + s or COMMAND + s on Macs.

**Serving Your Page** Mimir supports a basic web server that you can run by typing `srv`:

```
srv

Serving HTTP on 0.0.0.0 port 80 ...
```

The `srv` program creates a network connection that listens for incoming requests from web browsers. When it receives one, it responds
by returning the `index.html` page that you just created and saved.

**Port numbers** Every program that makes a network connection is assigned a special **port number** that is used by the operating 
system to manage its connections. By convention, web servers are usually assigned to run on port 80.

**Viewing Your Page** Go to `View` in the top Mimir menu, then select `View Port` and choose port 80. This action will pop up a new tab 
displaying your web page.

The URL for your page will be something like:

```
https://silly-baldr_80.ide.mimir.io/
```

where `silly-baldr` will be replaced with a different name matching your current Mimir workspace.

**Press CTRL + c in the terminal window to stop the server program**.


### Page Contents

Web pages are written in **HTML**, the *Hypertext Markup Language*. An HTML file is a mixture of regular text and special **tags** that tell your web browser how to format the page.

All tags are enclosed in angle brackets.

THe top-level tag is `<html>`, which encloses all of the page content. Inside the `<html>` tag are two main sections:

- `<head>`, which is used to hold meta-information about the page.
- `<body`>, which stores the actual page content.

Notice that all of the tags have an opening version, like `<body>`, and a closing version with a slash, like `</body>`

Your example page uses two other tags

- `<h1>` is the top-level header tag. Anything you put between `<h1>` and its closing partner `</h1>` appears big and bold when the page renders. There are also `<h2>`, `<h3>`, and `<h4>` tags.

- `<p>` is the paragraph tag, to make a new section of text on the page.

### Jam

Before going further, experiment with making some changes to your page and visualizing the results.

Run the server using `srv`, reload the page, then stop the server using CTRL + c (or COMMAND + c on Mac) when you need to make changes.

### Interior Decoration

cURL is a useful tool that let's you interact with a remote server from the command line. Among its MANY uses is grabbing files from a remote location.

```
curl -O https://upload.wikimedia.org/wikipedia/commons/0/0a/The_Great_Wave_off_Kanagawa.jpg
```

The `-O` (that's "dash capital letter Oh") flag saves the file locally.

Open your `index.html` file and add an `<img>` tag in the body section to display the image.

```
<p>
    <img src="The_Great_Wave_off_Kanagawa.jpg"/>
</p>
```

Reload the page and check out your picture.

Yikes. That's large. You can add style to the tag to scale the image to a percentage of the display width:

```
<p>
    <img src="The_Great_Wave_off_Kanagawa.jpg" style="width:50%"/>
</p>
```

You can also set an absolute size in pixels, e.g. `"width:200px"`.

### A Little CSS

Styling elements using individual tags was common in the old-school web, but modern practice favors separating page content from styling. Let's add a `<style>` section to the `<head>` block that will hold rules for styling page elements.

This way of styling the page is called **CSS**, which is short for *Cascading Style Sheets*.

- HTML controls the page's content and structure

- CSS controls its style and formatting

```
<head>
    <title>This appears at the top of the browser.</title>

    <style>
        img {
            width: 50%;
        }
    </style>
</head>
```

The style rule specifies that the contents of all `<img>` tags should have their width set to 50% of the page size.

You can add elements to the style block to control the presentation of other parts of the page. For example, to style the contents of  the entire body:

```
<head>
    <title>This appears at the top of the browser.</title>

    <style>
        img {
            width: 200px;
        }

        body {
            font-family: "Helvetica", "Arial", sans-serif;
            font-size: 18pt;
            background-color: #FAFAFA;
        }
    </style>
</head>
```

**Fonts** The `font-family` parameter takes a list of fonts (a "font stack") and uses the first one that's available on the system. Here, the first choice font is Helvetica and the last choice is the default system sans-serif font, which is guaranteed to exist.`font-size` controls the size.

**Colors** Colors are specified as three values, denoting the red, green, and blue components of the color. Each value is represented using the **hexadecimal** number system, which encodes a byte of data as a number from `00` to `FF`. We'll talk more about number formats in a later lecture.

The string `#FAFAFA` sets R, G, and B to a nice equal gray color. For something more vibrant try

- `#0071BA` (the official brand-approved Rollins blue color). This color has no red (`00`), some green (`71`) and a good amount of blue (`BA`).
- `#FACF00` (the official brand-approved Rollins gold color). This color has a lot of red (`FA`), a good amount of green (`CF`), and no blue (`00`).

Play around with a color picker and experiment with different color strings:

https://htmlcolorcodes.com/color-picker/

You can also set the `color` property to control the color of the text.

**A e s t h e t i c s** Here's one last style block that makes things a little more readable by bringing the page contents to the center.

```
<style>
    img {
        width: 100%;
    }

    body {
        font-family: "Helvetica", "Arial", sans-serif;
        font-size: 18pt;
        color: #333333;
        background-color: #FCFCFC;
        margin: 40px auto;
        max-width: 640px;
    }
</style>
```

`max-width` controls the size of the display region in the browser.

`margin` sets a padding of 40px around all sides of the page content; `auto` centers the display region inside the browser frame, pulling everything to the middle. Note that this is centering the display region, not the content itself.

The background and text are softened a little away from strict white and black.

## One More Thing...
Telnet is a program for establishing a remote connection to another server.

```
sudo apt-get install telnet
telnet towel.blinkenlights.nl
```

Close the terminal window to quit.
