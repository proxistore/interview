package ex05;

public class Main {

    /**
        Imagine that you have an application that allows users to create advertisements.
        This specific method updates the diffusion period of an advertisement and saves the resulting changes in the repository.
        Does it work ?
     */

    public void updateDiffusionPeriod(String advertisementId, Integer startDate, Integer stopDate) {
        // Gets the advertisement from the repository
        Advertisement advertisement = this.advertisementRepository.findById(advertisementId).orElse(null);
        // Updates the diffusion period of the advertisement
        advertisement.updateDiffusionPeriod(new PeriodDate(DateHelper.convertYYYYMMDDtoLocalDate(startDate), DateHelper.convertYYYYMMDDtoLocalDate(stopDate)));
    }

}
