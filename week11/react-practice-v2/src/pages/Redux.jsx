import { useState } from 'react';
import { Counter, CounterController } from "../components/ReduxExample";

export const Redux = () => {
    const [count, setCount] = useState(0);
    
    const increment = () => {

    }
    
    return (
        <>
            <h1>Redux Examples</h1>
            <Counter count={count}/>
            <Counter count={count}/>
            <CounterController setCount={setCount}/>
        </>
    );
}