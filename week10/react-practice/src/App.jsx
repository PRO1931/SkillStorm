import { useState } from "react";
import { Header } from "./components/Header.jsx";   // .js/.jsx is OPTIONAL
import { Counter } from "./components/Counter.jsx";
import { ClassCounter } from "./components/ClassCounter.jsx";
import { Article } from "./components/Article.jsx";
import { Footer } from "./components/Footer.jsx";
import { InlineStyling } from './components/InlineStyling.jsx';
import { MyButton } from './components/MyButton.jsx';
import { NavBar } from './components/NavBar/NavBar.jsx';
// import './Apps.css'; // This overrides the previous styles, because I defined it lower in the tree

// This works the same
// function App()

// }

// I prefer the arrow function
const App = () => {

    const [shouldRender, toggleShouldRender] = useState(false);

    // In a "function component" we return all of the JSX that we need to render to the page
    return (
        // In React, you can only return 1 JSX element at a time

        // This is a fragment and it does not render to the page
        // It's useful for returning 2+ JSX elements at once
        <>


        <NavBar />









        <br /><br /><br /><br /><br />


        <button onClick={() => toggleShouldRender(!shouldRender)}>Render Class Component</button>
            <Header />
            <Counter />
            {/* null does not render to the page.
                Here I'm only rendering class counter if shouldRender is true */}
            {/* Conditional rendering */}
            {shouldRender ? <ClassCounter /> : null}

            {/* By using the Article component, we've made a "reusable component" that makes
            the creation of future articles much easier. I just need to follow this template
            */}
            {/* I can utilize props to make my article more specific */}
            <MyButton>Submit</MyButton>
            <InlineStyling />
           <Article 
                title="React is Awesome!" 
                author="Sean Carter" 
                datePublished="04/07/2022"
            >
                React is so cool!
                <div>Hey!</div>
            </Article>
            <br />
            <Article title="React is so Confusing" author="Juhyun Shin" datePublished="01/01/2022">
                React is so so confusing.
            </Article>
            <br />
            <Article title="Something" author="Somebody" datePublished="Someday">
                Some Text
            </Article>
            <br />

            {/* Alternative is typing this up */}
            <article>
                <header>
                    <h1>Title</h1>
                    <h2>Author</h2>
                </header>
                <p>Text</p>
                <footer>
                    <h4>Date Published</h4>
                </footer>
            </article>
            
            {/* <Counter /> */}
            {/* <p>
                Today we are practicing React. React is a cool UI library.
            </p> */}


        </>
    );
}

export default App;

// export
// export default

// You can only have one default export per file

// Any regular export (no default) will be all bundled into one JS object
// As such, importing them you'll use destructure syntax