package p.a.ble

/**
 * ad_types:
 *  - value: 0x01
 *    name: Flags
 *    reference: Core Specification Supplement, Part A, Section 1.3
 *  - value: 0x02
 *    name: Incomplete List of 16-bit Service or Service Class UUIDs
 *    reference: Core Specification Supplement, Part A, Section 1.1
 *  - value: 0x03
 *    name: Complete List of 16-bit Service or Service Class UUIDs
 *    reference: Core Specification Supplement, Part A, Section 1.1
 *  - value: 0x04
 *    name: Incomplete List of 32-bit Service or Service Class UUIDs
 *    reference: Core Specification Supplement, Part A, Section 1.1
 *  - value: 0x05
 *    name: Complete List of 32-bit Service or Service Class UUIDs
 *    reference: Core Specification Supplement, Part A, Section 1.1
 *  - value: 0x06
 *    name: Incomplete List of 128-bit Service or Service Class UUIDs
 *    reference: Core Specification Supplement, Part A, Section 1.1
 *  - value: 0x07
 *    name: Complete List of 128-bit Service or Service Class UUIDs
 *    reference: Core Specification Supplement, Part A, Section 1.1
 *  - value: 0x08
 *    name: Shortened Local Name
 *    reference: Core Specification Supplement, Part A, Section 1.2
 *  - value: 0x09
 *    name: Complete Local Name
 *    reference: Core Specification Supplement, Part A, Section 1.2
 *  - value: 0x0A
 *    name: Tx Power Level
 *    reference: Core Specification Supplement, Part A, Section 1.5
 *  - value: 0x0D
 *    name: Class of Device
 *    reference: Core Specification Supplement, Part A, Section 1.6
 *  - value: 0x0E
 *    name: Simple Pairing Hash C-192
 *    reference: Core Specification Supplement, Part A, Section 1.6
 *  - value: 0x0F
 *    name: Simple Pairing Randomizer R-192
 *    reference: Core Specification Supplement, Part A, Section 1.6
 *  - value: 0x10
 *    name: Device ID
 *    reference: Device ID Profile (when used in EIR data)
 *  - value: 0x10
 *    name: Security Manager TK Value
 *    reference: Core Specification Supplement, Part A, Section 1.8 (when used in OOB data blocks)
 *  - value: 0x11
 *    name: Security Manager Out of Band Flags
 *    reference: Core Specification Supplement, Part A, Section 1.7
 *  - value: 0x12
 *    name: Peripheral Connection Interval Range
 *    reference: Core Specification Supplement, Part A, Section 1.9
 *  - value: 0x14
 *    name: List of 16-bit Service Solicitation UUIDs
 *    reference: Core Specification Supplement, Part A, Section 1.10
 *  - value: 0x15
 *    name: List of 128-bit Service Solicitation UUIDs
 *    reference: Core Specification Supplement, Part A, Section 1.10
 *  - value: 0x16
 *    name: Service Data - 16-bit UUID
 *    reference: Core Specification Supplement, Part A, Section 1.11
 *  - value: 0x17
 *    name: Public Target Address
 *    reference: Core Specification Supplement, Part A, Section 1.13
 *  - value: 0x18
 *    name: Random Target Address
 *    reference: Core Specification Supplement, Part A, Section 1.14
 *  - value: 0x19
 *    name: Appearance
 *    reference: Core Specification Supplement, Part A, Section 1.12
 *  - value: 0x1A
 *    name: Advertising Interval
 *    reference: Core Specification Supplement, Part A, Section 1.15
 *  - value: 0x1B
 *    name: LE Bluetooth Device Address
 *    reference: Core Specification Supplement, Part A, Section 1.16
 *  - value: 0x1C
 *    name: LE Role
 *    reference: Core Specification Supplement, Part A, Section 1.17
 *  - value: 0x1D
 *    name: Simple Pairing Hash C-256
 *    reference: Core Specification Supplement, Part A, Section 1.6
 *  - value: 0x1E
 *    name: Simple Pairing Randomizer R-256
 *    reference: Core Specification Supplement, Part A, Section 1.6
 *  - value: 0x1F
 *    name: List of 32-bit Service Solicitation UUIDs
 *    reference: Core Specification Supplement, Part A, Section 1.10
 *  - value: 0x20
 *    name: Service Data - 32-bit UUID
 *    reference: Core Specification Supplement, Part A, Section 1.11
 *  - value: 0x21
 *    name: Service Data - 128-bit UUID
 *    reference: Core Specification Supplement, Part A, Section 1.11
 *  - value: 0x22
 *    name: LE Secure Connections Confirmation Value
 *    reference: Core Specification Supplement, Part A, Section 1.6
 *  - value: 0x23
 *    name: LE Secure Connections Random Value
 *    reference: Core Specification Supplement, Part A, Section 1.6
 *  - value: 0x24
 *    name: URI
 *    reference: Core Specification Supplement, Part A, Section 1.18
 *  - value: 0x25
 *    name: Indoor Positioning
 *    reference: Indoor Positioning Service
 *  - value: 0x26
 *    name: Transport Discovery Data
 *    reference: Transport Discovery Service
 *  - value: 0x27
 *    name: LE Supported Features
 *    reference: Core Specification Supplement, Part A, Section 1.19
 *  - value: 0x28
 *    name: Channel Map Update Indication
 *    reference: Core Specification Supplement, Part A, Section 1.20
 *  - value: 0x29
 *    name: PB-ADV
 *    reference: Mesh Profile Specification, Section 5.2.1
 *  - value: 0x2A
 *    name: Mesh Message
 *    reference: Mesh Profile Specification, Section 3.3.1
 *  - value: 0x2B
 *    name: Mesh Beacon
 *    reference: Mesh Profile Specification, Section 3.9
 *  - value: 0x2C
 *    name: BIGInfo
 *    reference: Core Specification Supplement, Part A, Section 1.21
 *  - value: 0x2D
 *    name: Broadcast_Code
 *    reference: Core Specification Supplement, Part A, Section 1.22
 *  - value: 0x2E
 *    name: Resolvable Set Identifier
 *    reference: Coordinated Set Identification Profile v1.0 or later
 *  - value: 0x2F
 *    name: Advertising Interval - long
 *    reference: Core Specification Supplement, Part A, Section 1.15
 *  - value: 0x30
 *    name: Broadcast_Name
 *    reference: Public Broadcast Profile v1.0 or later
 *  - value: 0x31
 *    name: Encrypted Advertising Data
 *    reference: Core Specification Supplement, Part A, Section 1.23
 *  - value: 0x32
 *    name: Periodic Advertising Response Timing Information
 *    reference: Core Specification Supplement, Part A, Section 1.24
 *  - value: 0x34
 *    name: Electronic Shelf Label
 *    reference: ESL Profile
 *  - value: 0x3D
 *    name: 3D Information Data
 *    reference: 3D Synchronization Profile
 *  - value: 0xFF
 *    name: Manufacturer Specific Data
 *    reference: Core Specification Supplement, Part A, Section 1.4
 * */
enum class AdType(
    val value: Byte,
    val ref: String,
) {
    NONE(
        0x00,
        "-"
    ),
    FLAGS(
        0x01,
        "Core Specification Supplement, Part A, Section 1.3"
    ),
    INCOMPLETE_LIST_OF_16_BIT_SERVICE_UUIDS(
        0x02,
        "Core Specification Supplement, Part A, Section 1.1"
    ),
    COMPLETE_LIST_OF_16_BIT_SERVICE_UUIDS(
        0x03,
        "Core Specification Supplement, Part A, Section 1.1"
    ),
    INCOMPLETE_LIST_OF_32_BIT_SERVICE_UUIDS(
        0x04,
        "Core Specification Supplement, Part A, Section 1.1"
    ),
    COMPLETE_LIST_OF_32_BIT_SERVICE_UUIDS(
        0x05,
        "Core Specification Supplement, Part A, Section 1.1"
    ),
    INCOMPLETE_LIST_OF_128_BIT_SERVICE_UUIDS(
        0x06,
        "Core Specification Supplement, Part A, Section 1.1"
    ),
    COMPLETE_LIST_OF_128_BIT_SERVICE_UUIDS(
        0x07,
        "Core Specification Supplement, Part A, Section 1.1"
    ),
    SHORTENED_LOCAL_NAME(
        0x08,
        "Core Specification Supplement, Part A, Section 1.2"
    ),
    COMPLETE_LOCAL_NAME(
        0x09,
        "Core Specification Supplement, Part A, Section 1.2"
    ),
    TX_POWER_LEVEL(
        0x0A,
        "Core Specification Supplement, Part A, Section 1.5"
    ),
    CLASS_OF_DEVICE(
        0x0D,
        "Core Specification Supplement, Part A, Section 1.6"
    ),
    SIMPLE_PAIRING_HASH_C_192(
        0x0E,
        "Core Specification Supplement, Part A, Section 1.6"
    ),
    SIMPLE_PAIRING_RANDOMIZER_R_192(
        0x0F,
        "Core Specification Supplement, Part A, Section 1.6"
    ),
    DEVICE_ID(
        0x10,
        "Device ID Profile (when used in EIR data)"
    ),
    SECURITY_MANAGER_TK_VALUE(
        0x10,
        "Core Specification Supplement, Part A, Section 1.8 (when used in OOB data blocks)"
    ),
    SECURITY_MANAGER_OUT_OF_BAND_FLAGS(
        0x11,
        "Core Specification Supplement, Part A, Section 1.7"
    ),
    PERIPHERAL_CONNECTION_INTERVAL_RANGE(
        0x12,
        "Core Specification Supplement, Part A, Section 1.9"
    ),
    LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS(
        0x14,
        "Core Specification Supplement, Part A, Section 1.10"
    ),
    LIST_OF_128_BIT_SERVICE_SOLICITATION_UUIDS(
        0x15,
        "Core Specification Supplement, Part A, Section 1.10"
    ),
    SERVICE_DATA_16_BIT_UUID(
        0x16,
        "Core Specification Supplement, Part A, Section 1.11"
    ),
    PUBLIC_TARGET_ADDRESS(
        0x17,
        "Core Specification Supplement, Part A, Section 1.13"
    ),
    RANDOM_TARGET_ADDRESS(
        0x18,
        "Core Specification Supplement, Part A, Section 1.13"
    ),
    APPEARANCE(
        0x19,
        "Core Specification Supplement, Part A, Section 1.14"
    ),
    ADVERTISING_INTERVAL(
        0x1A,
        "Core Specification Supplement, Part A, Section 1.15"
    ),
    LE_BLUETOOTH_DEVICE_ADDRESS(
        0x1B,
        "Core Specification Supplement, Part A, Section 1.16"
    ),
    LE_ROLE(
        0x1C,
        "Core Specification Supplement, Part A, Section 1.17"
    ),
    SIMPLE_PAIRING_HASH_C_256(
        0x1D,
        "Core Specification Supplement, Part A, Section 1.6"
    ),
    SIMPLE_PAIRING_RANDOMIZER_R_256(
        0x1E,
        "Core Specification Supplement, Part A, Section 1.6"
    ),
    LIST_OF_32_BIT_SERVICE_SOLICITATION_UUIDS(
        0x1F, "Core Specification Supplement, Part A, Section 1.10"
    ),
    SERVICE_DATA_32_BIT_UUID(
        0x20,
        "Core Specification Supplement, Part A, Section 1.11"
    ),
    SERVICE_DATA_128_BIT_UUID(
        0x21,
        "Core Specification Supplement, Part A, Section 1.11"
    ),
    LE_SECURE_CONNECTIONS_CONFIRMATION_VALUE(
        0x22,
        "Core Specification Supplement, Part A, Section 1.6"
    ),
    LE_SECURE_CONNECTIONS_RANDOM_VALUE(
        0x23,
        "Core Specification Supplement, Part A, Section 1.6"
    ),
    URI(
        0x24,
        "Core Specification Supplement, Part A, Section 1.18"
    ),
    INDOOR_POSITIONING(
        0x25,
        "Indoor Positioning Service"
    ),
    TRANSPORT_DISCOVERY_DATA(
        0x26,
        "Transport Discovery Service"
    ),
    LE_SUPPORTED_FEATURES(
        0x27,
        "Core Specification Supplement, Part A, Section 1.19"
    ),
    CHANNEL_MAP_UPDATE_INDICATION(
        0x28,
        "Core Specification Supplement, Part A, Section 1.20"
    ),
    PB_ADV(
        0x29,
        "Mesh Profile Specification, Section 5.2.1"
    ),
    MESH_MESSAGE(
        0x2A,
        "Mesh Profile Specification, Section 3.3.1"
    ),
    MESH_BEACON(
        0x2B,
        "Mesh Profile Specification, Section 3.9"
    ),
    BIGINFO(
        0x2C,
        "Core Specification Supplement, Part A, Section 1.21"
    ),
    BROADCAST_CODE(
        0x2D,
        "Core Specification Supplement, Part A, Section 1.22"
    ),
    RESOLVABLE_SET_IDENTIFIER(
        0x2E,
        "Coordinated Set Identification Profile v1.0 or later"
    ),
    ADVERTISING_INTERVAL_LONG(
        0x2F,
        "Core Specification Supplement, Part A, Section 1.15"
    ),
    BROADCAST_NAME(
        0x30,
        "Public Broadcast Profile v1.0 or later"
    ),
    ENCRYPTED_ADVERTISING_DATA(
        0x31,
        "Core Specification Supplement, Part A, Section 1.23"
    ),
    PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION(
        0x32, "Core Specification Supplement, Part A, Section 1.24"
    ),
    ELECTRONIC_SHELF_LABEL(
        0x34,
        "ESL Profile"
    ),
    INFORMATION_3D(
        0x3D,
        "3D Synchronization Profile"
    ),
    MANUFACTURER_SPECIFIC_DATA(
        0xFF.toByte(),
        "Core Specification Supplement, Part A, Section 1.4"
    ), ;

    companion object {
        fun from(rawType: Byte): AdType = entries.firstOrNull { it.value == rawType } ?: NONE
    }
}