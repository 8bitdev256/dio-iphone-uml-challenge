# UML Class Diagram - Made with [Mermaid](https://mermaid.js.org/)

```mermaid
classDiagram
    class MusicPlayer {
        +play() void
        +pause() void
        +selectMusic(String music) void
    }

    class Phone {
        +answer() void
        +startVoiceMail() void
        +call(String phoneNumber) void
    }

    class WebBrowser {
        +newTab() void
        +refreshPage() void
        +goTo(String url) void
    }

    class iPhone {
        -musicPlayer : MusicPlayer
        -phone : Phone
        -webBrowser : WebBrowser
    }

    MusicPlayer --> iPhone
    Phone --> iPhone
    WebBrowser --> iPhone
```
