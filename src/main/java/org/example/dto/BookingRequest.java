package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.TicketRecord;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingRequest {

    private String sourceStation;
    private String destinationStation;
    private List<TicketRecord> ticketRecords;
    private int userId;
}
