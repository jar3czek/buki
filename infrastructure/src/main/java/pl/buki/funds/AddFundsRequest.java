package pl.buki.funds;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class AddFundsRequest {

  @NotNull
  private Integer euroGoals;
}
