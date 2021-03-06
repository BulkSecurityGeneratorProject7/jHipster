package com.mocean.pos.service;

import com.mocean.pos.service.dto.BillItemDTO;
import java.util.List;

/**
 * Service Interface for managing BillItem.
 */
public interface BillItemService {

    /**
     * Save a billItem.
     *
     * @param billItemDTO the entity to save
     * @return the persisted entity
     */
    BillItemDTO save(BillItemDTO billItemDTO);

    /**
     * Get all the billItems.
     *
     * @return the list of entities
     */
    List<BillItemDTO> findAll();

    /**
     * Get the "id" billItem.
     *
     * @param id the id of the entity
     * @return the entity
     */
    BillItemDTO findOne(Long id);

    /**
     * Delete the "id" billItem.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
