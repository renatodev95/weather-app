import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Weather } from '../model/weather';
import { Observable, first, map } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class WeatherService {
  private readonly API = 'api/weather';

  constructor(private http: HttpClient) {}

  getWeather(city: string): Observable<Weather> {
    return this.http
      .get(`${this.API}/${city}`)
      .pipe(map((data) => data as Weather));
  }
}
