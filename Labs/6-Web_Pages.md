# Intro to Web Pages

## Write and Serve a Basic Web Page

### Creating the Page

Go to [jsfiddle.net](jsfiddle.net), a site that lets you practice writing web-based code projects. Put the following text in the HTML window. I'll tell you more about how this file is put together in the next section, after you've had the
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

Save the file using CTRL + s (or COMMAND + s on Macs) and the rendered web page will display in the corner.


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

Before going further, experiment with making some changes to your page and visualizing the results. Save after each change and you should see the results appear in the bottom corner.

Try creating an unordered list of items using the `<ul>` and `<li>` tags:

```
<p>Ian's stuffed animals:</p>

<ul>
    <li> Pickles the tiger
    <li> Manny the Manatee
    <li> Douglas the brown owl
</ul>
```

You can create a link using the `<a>` tag (for "anchor"). The tag contains a parameter called `href` that specifies the destination of the link:

```
<a href="https://squishmallows.com">Will loves these and calls them "Blobbers".</a>
```

### Interior Decoration


Add an `<img>` tag in the body section to display the image. The `src` property specifies either a local file name or a remote URL to use as the source
of the image. In this case, I'm linking directly to a Wikimedia image.

```
<p>
    <img src="https://upload.wikimedia.org/wikipedia/commons/0/0a/The_Great_Wave_off_Kanagawa.jpg"/>
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

Styling elements using individual tags was common in the old-school web, but modern practice favors separating page content from styling. The language
used to control page styling is called CSS, which originally stood for "Cascading Style Sheets".

- HTML controls the page's content and overall structure
- CSS controls its style and formatting

Put the following rule in the CSS section of the jsfiddle page.

```
img {
    width: 50%;
}
```

The style rule specifies that the contents of all `<img>` tags should have their width set to 50% of the page size. Remove the `width:` attribute from the `img` tag in the body of the page, then reload the page and verify that the CSS rule causes the image to be displayed at 50% width.

### More Style Rules

You can add elements to the style block to control the presentation of other parts of the page. For example, to style the contents of  the entire body:

```
img {
    width: 50%;
}

body {
    font-family: "Helvetica", "Arial", sans-serif;
    font-size: 18pt;
    background-color: #FAFAFA;
}
```

**Fonts** The `font-family` parameter takes a list of fonts (a "font stack") and uses the first one that's available on the system. Here, the first choice font is Helvetica and the last choice is the default system sans-serif font, which is guaranteed to exist in every browser.`font-size` controls the size.

**Colors** Colors are specified as three values, denoting the red, green, and blue components of the color. Each value is represented using the **hexadecimal** number system, which encodes a byte of data as a number from `00` to `FF`.

The string `#FAFAFA` sets R, G, and B to a nice equal gray color. For something more vibrant try

- `#0071BA` (the official brand-approved Rollins blue color). This color has no red (`00`), some green (`71`) and a good amount of blue (`BA`).
- `#FACF00` (the official brand-approved Rollins gold color). This color has a lot of red (`FA`), a good amount of green (`CF`), and no blue (`00`).

Play around with a color picker and experiment with different color strings:

https://htmlcolorcodes.com/color-picker/

You can also set the `color` property to control the color of the text.

### a e s t h e t i c s

Here's one last style block that makes things a little more readable by bringing the page contents to the center.

```
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
```

`max-width` controls the size of the display region in the browser.

`margin` sets a padding of 40px around all sides of the page content; `auto` centers the display region inside the browser frame, pulling everything to the middle. Note that this is centering the display region, not the content itself.

The background and text are softened a little away from strict white and black.
