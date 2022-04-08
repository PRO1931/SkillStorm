// This is a Header component
// Whenever I use <Header /> it translates to <h1>Hello World</h1><h2>Made By: Peter Morales</h2>

export const Header = (props) => {
    return (
        <header>
        <h1>{props.title}</h1>
        <h2>Made By: {props.author}</h2>
        </header>
    );
}