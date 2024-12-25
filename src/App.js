import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import TripList from "./TripList";
import BookingForm from "./BookingForm";
import Login from "./Login";
import Signup from "./Signup";

function App() {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<TripList />} />
                <Route path="/book" element={<BookingForm />} />
                <Route path="/login" element={<Login />} />
                <Route path="/signup" element={<Signup />} />
            </Routes>
        </Router>
    );
}

export default App;
