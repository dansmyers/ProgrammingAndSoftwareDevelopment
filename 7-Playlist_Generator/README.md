# Finish the Playlist Generator Project

## Due April 30

<img src="https://upload.wikimedia.org/wikipedia/en/c/c8/Carly_Rae_Jepsen_-_I_Really_Like_You.png" wdith="100%" />

## Files from class

The files that we wrote in class are available in the Examples directory.

## Move `.mvn` to your project directory

The `.mvn` directory is a "hidden" directory used by the Maven build tool. Files and directories starting with `.` are considered hidden and won't be displayed by the shell when you do a regular `ls` command.

Copy `.mvn` from your other project directory into `Playlist-Generator`. First, `cd` into `PLaylist-Generator`, then use the `cp` command:

```
cp -r ../cms167-f19-java-spring-boot/.mvn .
```

`-r` makes the copy operation recursive&ndash;copying all subdirectories&ndash; and `.` refers to the current working directory as the destination of the copy. You can verify that the operation worked by typing `ls -a`.


## Finish `TrackInfo.java`

If you haven't done so, use `PlaylistInfo` as a guide to complete `TrackInfo`. The methods are all symmetric.


## Add code to `Controller`

Add some code to the `/playlist` route defined in `Controller.java.` To begin, call the `randomWalk` method of `Recommender`, which returns a `HashSet` of track ids for the randomly generated playlist.

```
HashSet<String> results = this.rec.randomWalk(10);
```

Return the results of the random walk as a single `String`:

```
return results.toString();
```


## Test

You should now be able to build and run the project.

```
./mvnw clean package

java -jar target/cms121-playlist-generator-0.1.0.jar
```

If the build fails, then read the errors carefully and make the necessary corrections.

Once you can run the serber, view the web page on port 80 and click the button. You should see a list of tracks IDs appear as the output from your request.

## Update `index.html`

Open `html/index.html` and change the title and text to describe your own playlist generation tool.

## Add Spotify `<iframe>`

The final step is to improve the results returned by the `/playlist` route. Rather than returning a simple `String` of track ids (which, after all, are meaningless outside of the Spotify application), we'll return a set of HTML `<iframe>` elements that will display each track in a mini-player.

The `<iframe>` element is one way to embed interactive media within a web page. For example, add the following code fragment to `index.html` and reload your page:

```
<iframe src="https://open.spotify.com/embed/album/1DFixLWuPkv3KT3TnV35m3" width="300" height="380" frameborder="0" allowtransparency="true" allow="encrypted-media autoplay"></iframe>
```

You'll see the embedded Spotify widget loaded with the album associated with the unique id string (`1DFixLWuPkv3KT3TnV35m3`) given in the `<iframe>`'s `src` parameter.

You need to modify the `/playlist` route so that the ids returned by the `Recommender` are converted into a series of `<iframe>` statements. If you put all of the `<iframe>` elements in one `String` and return it, then the entire collection of embedded players, one for each song, will be displayed on the front end.

Here is a template to help you get started. Look up the relevant `String` methods in the [official documentation](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) if you need help. In particular, look at using `substring` and `replace`.

```
@RequestMapping("/playlist")
public String playlist() {
    HashSet<String> results = this.rec.randomWalk(30);

    // Generic template for created song iframes
    // Notice the TRACK_ID placeholder in the src URL -- we'll replace this with the real track IDs

    String template = "<iframe src=\"https://open.spotify.com/embed/track/TRACK_ID\" width=\"300\" height=\"380\" frameborder=\"0\" allowtransparency=\"true\" allow=\"encrypted-media autoplay\"></iframe>";

    String response = "";

    // Loop over the Strings contained in results

        // Each result String has the form spotify:track:6Ln76fIfkdmL6UHbuYR756

        // Extract the alphanumeric code from the result String by stripping off "spotify:track:"

        // Use the template.replace method to create a new String that replaces TRACK_ID in the template
        // string with the real track id

        // Append the complete String with the track id to response

    return response;
}

```

Rebuild and run the application. Now you should see your customized page filled with embedded players for the tracks on your list!

## Improvement

Take a look at the output produced by your generator. Does it seem good? Could you think of a way to improve it?

Here's a common problem: many playlists have lots of individual songs by a large number of artists, but those songs mostly don't appear on the other playlists in your dataset. For example, in my 90s and 00s boy bands example, there is one playlist of "90s summer hits" that includes a lot of popular songs that only appear on that one list but not on any others.

A playlist with lots of unique tracks functions as a "sink" in the random walk process &ndash; given enough time, the walk is likely to get stuck on the playlist and bounce around among its tracks but never escape back to other playlists. In practice, this often leads to randomized playlists made up mostly of one-off songs by artists that are removed from the original artists contained in your starting playlist.

To correct for this behavior, you can randomly reset back to the starting playlist. Periodic resets keep the process from wandering too far from the starting source, while still given it a chance to find interesting items. Modify your `randomWalk` method to use the following strategy:

```
for (int i = 0; i < 100; i++) {
    // Choose a track from the current playlist
    nextTrack = this.playlists.get(pl).randomTrack();

    // Choose a playlist that contains the track
    pl = this.tracks.get(nextTrack).randomPlaylist();
    
    // Generate a random number in [0, 1.0)
    
    // With a 1% probability, reset pl to the starting playlist
}
```

Experiment with this change. You can also try different parameters for the length of the walk and the reset probability.


## Submission

Zip your entire project directory, download the zip, and then submit it to Canvas.

```
cd ~     (use this command to return to your top-level home directory)

zip -r FILE_NAME.zip Playlist-Generator
```
