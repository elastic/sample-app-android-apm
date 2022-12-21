package co.elastic.apm.android.sample.backend.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {
    double latitude;
    double longitude;
}
