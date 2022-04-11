import { Header } from "./Header";
import { Footer } from "./Footer";
// import { ArticleBody } from "./ArticleBody";

export const Article = (props) => {
    console.log('Article Props:', props);
    return (
        <article className={props.className}>
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