import styled from 'styled-components';
import { NavItem } from './NavItem';
import { NavLink } from './NavLink';

// Creates a container component by styling a <nav> element
const NavContainer = styled.nav`
    background-color: #E5679B;
    padding: 2em 1em;
    font-size: 20px;
    display: flex;
    justify-content: flex-start;
`;

export const NavBar = () => {
    return (
        <NavContainer>
            <NavItem>Home</NavItem>
            <NavItem>About</NavItem>
            <NavItem>My Experience</NavItem>
            <NavItem>
                <NavLink href="https://www.facebook.com">Connect With Me On Facebook </NavLink>
            </NavItem>
        </NavContainer>
    );
}