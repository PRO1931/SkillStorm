import { Header } from "./Header";
import { Footer } from "./Footer";

export const Article = (props) => {
    return (
        <article>
            {/* I want a Article Header */}
            <Header title={props.title} author={props.author}/>
            {/* I want an Article Body */}
            <p>
                {props.children}
            </p>
            {/* I want an Article Footer */}
            <Footer datePublished= {props.publishDate} />
        </article>
    );
}