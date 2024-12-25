import React, { useState } from "react";
import axios from "axios";

function BookingForm() {
    const [userName, setUserName] = useState(""); // Corrected here
    const [tripId, setTripId] = useState("");

    const handleBooking = () => {
        axios.post("http://localhost:8080/api/bookings", { userName, tripId: Number(tripId) })
            .then(response => {
                alert("Booking Successful");
                // Optionally, reset the form
                setUserName(""); // Corrected here
                setTripId("");
            })
            .catch(error => {
                console.error(error);
                alert("Error creating booking");
            });
    };

    return (
        <div>
            <h1>Book a Trip</h1>
            <input
                type="text"
                placeholder="Your Name"
                value={userName}
                onChange={(e) => setUserName(e.target.value)} // Corrected here
            />
            <input
                type="number"
                placeholder="Trip ID"
                value={tripId}
                onChange={(e) => setTripId(e.target.value)}
            />
            <button onClick={handleBooking}>Book Now</button>
        </div>
    );
}

export default BookingForm;