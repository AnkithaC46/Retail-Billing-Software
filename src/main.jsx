import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css';
import { BrowserRouter } from 'react-router-dom';
import App from './App.jsx';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/js/bootstrap.bundle.js';
import 'bootstrap-icons/font/bootstrap-icons.css';
import { AppContextProvider } from './context/AppContext.jsx';

createRoot(document.getElementById('root')).render(
    <BrowserRouter>
    <AppContextProvider>
        <App/>
    </AppContextProvider>
    </BrowserRouter>
  
)

