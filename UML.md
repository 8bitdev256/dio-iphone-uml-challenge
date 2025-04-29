# UML Class Diagram - Made with [Mermaid](https://mermaid.js.org/)

```mermaid
classDiagram
    class MusicPlayer {
        +method1()
        +method2(String example)
    }

    class Phone {
        +method1()
        +method2(String example)
    }

    class WebBrowser {
        +method1()
        +method2(String example)
    }

    class iPhone {
    }

    iPhone --> MusicPlayer
    iPhone --> Phone
    iPhone --> WebBrowser
```
