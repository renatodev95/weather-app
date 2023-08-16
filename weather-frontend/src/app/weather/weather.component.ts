import { Component, OnInit } from '@angular/core';
import { WeatherService } from './services/weather.service';
import { Weather } from './model/weather';
import { MatDialog } from '@angular/material/dialog';
import { ErrorModalComponent } from './error-modal/error-modal.component';

@Component({
  selector: 'app-weather',
  templateUrl: './weather.component.html',
  styleUrls: ['./weather.component.css'],
})
export class WeatherComponent implements OnInit {
  cityName: string = '';
  weatherData!: Weather;

  constructor(
    private weatherService: WeatherService,
    private dialog: MatDialog
  ) {}

  ngOnInit() {}

  getWeather(cityName: string) {
    if (cityName) {
      this.weatherService.getWeather(cityName).subscribe((data) => {
        if (data.error) {
          this.openErrorModal(data.error);
        } else {
          this.cityName = '';
          this.weatherData = data;
        }
      });
    }
  }

  openErrorModal(errorMessage: string) {
    this.dialog.open(ErrorModalComponent, {
      data: { errorMessage },
    });
  }
}
