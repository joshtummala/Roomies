package com.roomies.backend.data;

import java.util.Objects;

public class Location {

  private String city;
  private String state;
  private String country;

  public Location(String city, String state, String country) {
    this.city = city;
    this.state = state;
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Location location = (Location) o;
    return city.equals(location.city) &&
            state.equals(location.state) &&
            country.equals(location.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, state, country);
  }

  @Override
  public String toString() {
    return "Location{" +
            "city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", country='" + country + '\'' +
            '}';
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getCountry() {
    return country;
  }
}
